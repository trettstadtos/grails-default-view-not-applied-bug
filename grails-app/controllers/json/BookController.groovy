package json

class BookController {

  def index () {
    list ()
  }

  def show () {
    respond new Book (title: 'The Shining', author: 'Stephen King')
  }

  def list () {
    def books = [
      new Book (title: 'The Shining', author: 'Stephen King'),
      new Book (title: 'The Pillars of the Earth', author: 'Ken Follett'),
      new Book (title: 'Neuromancer', author: 'William Gibson')
    ]
    [books: books]
  }
}
