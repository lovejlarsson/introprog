package photo 

type Matrix = Array[Array[Short]]

def Matrix(width: Int, height: Int)(values: Short*): Matrix = 
  Array.tabulate(width, height)((x, y) => values(width * y + x))

extension (m: Matrix) 
  def apply(x: Int, y: Int): Short = m(x)(y)
  def update(x: Int, y: Int, value: Short): Unit = m(x)(y) = value
  def col(x: Int): Array[Short] = m(x)
  def row(y: Int): Array[Short] = m.map(cols => cols(y))