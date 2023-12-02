part of CsvSheet;

/**
 * Currently CsvRow is only used as a type passed to the [CsvSheet.forEachRow]
 * method.
 * 
 * CsvRow is a 1-based index of the cells contained in that row. Alternatively
 * any headers that the [CsvSheet] contains my also be used to index the rows.
 */
class CsvRow {

  late List<String> row;
  
  late HashMap _headers;
  bool hasHeaders = false;

  CsvRow(HashMap headers);

 
  String operator [](index) {
    if(index is String) {
      var tmp = index;
      if(!hasHeaders) {
        throw new RangeError('$tmp is not a valid column header');
      }
      
      if(!_headers.containsKey(index)) 
        throw new RangeError('$tmp is not a valid column header');
      
      index = _headers[index];
    } else {
      index -= 1;
    }
    return row[index];
  }
  
  /**
   * Currently writing back to the CsvRow is not supported. This operation
   * throws an [UnsupportedError].
   */
  operator []=(index, value) {
    throw new UnsupportedError('Unable to assign a value to a cell.');
  }
  
  String toString() => row.toString();
  
}