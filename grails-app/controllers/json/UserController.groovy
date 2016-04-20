package json

class UserController {

  def index () {
    list ()
  }

  def show () {
    respond new User (firstName: 'First', lastName: 'Last', company: 'MyCompany', sapId: 'S000119203', email: 'one@example.com', function: 'CEO', roles: [new Role (name: 'Editor', permissions: ['read', 'write'])])
  }

  def list () {
    def users = [
      new User (firstName: 'First', lastName: 'Last', company: 'MyCompany', sapId: 'S000119203', email: 'one@example.com', function: 'CEO', roles: [new Role (name: 'Editor', permissions: ['read', 'write'])]),
      new User (firstName: 'First', lastName: 'Last', company: 'MyCompany', sapId: 'S000119204', email: 'two@example.com', function: 'CEO', roles: [new Role (name: 'Editor', permissions: ['read', 'write'])]),
      new User (firstName: 'First', lastName: 'Last', company: 'MyCompany', sapId: 'S000119205', email: 'three@example.com', function: 'CEO', roles: [new Role (name: 'Editor', permissions: ['read', 'write'])])]
    [users: users]
  }
}
