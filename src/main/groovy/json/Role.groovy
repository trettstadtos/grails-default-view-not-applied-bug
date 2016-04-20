package json

import groovy.transform.CompileStatic

@CompileStatic
class Role {
  String       name
  List<String> permissions

  @Override
  public String toString () {
    return "Role (name: '$name', permissions: $permissions)"
  }
}
