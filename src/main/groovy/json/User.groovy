package json

import groovy.transform.CompileStatic

@CompileStatic
class User {
  String     sapId
  String     firstName
  String     lastName
  String     email
  String     company
  String     function
  List<Role> roles

  @Override
  public String toString () {
    return "User (sapId: '$sapId', firstName: '$firstName', lastName: '$lastName', email: '$email', company: '$company', function: '$function', roles: $roles)"
  }
}