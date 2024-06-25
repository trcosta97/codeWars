def digital_root(n):
    nString = str(n)
    while len(nString) > 1:
        n = intToList(n)
        nString = str(n)
    return n

def intToList(number):
    string = str(number)
    list = []
    for i in string:
        list.append(int(i))
    return sum(list)

print(digital_root(2655265))