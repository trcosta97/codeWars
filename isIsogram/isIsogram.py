def is_isogram(string):
    lowerString = string.lower()

    for x in lowerString:
      if string.count(x) > 1:
          return 'False'
    return 'True'



print(is_isogram("Dermatoglyphics"))
print(is_isogram("isogram"))
print(is_isogram("aba"))
print(is_isogram("moOse"))
print(is_isogram("isIsogram"))
print(is_isogram(""))