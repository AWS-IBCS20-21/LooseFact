def LOI(L, G):
    har = 0
    for i in range (len(L)):
        har = L[i]
        for i in range (len(L)-1):
            har = har + L[i + 1]
            for i in range (len(L)-2):
                har = har + L[i + 2]
                if (har == G):
                    return True
    return False

def SUM(arg):
    har = 0
    for i in range (len(arg)):
        if (arg[i] != 6):
            if (arg[i] != 5):
                har = har + arg[i]
    return har

def lonesum(a,b,c):
    d = 0
    e = a
    f = b
    g = c
    sum = [a,b,c]
    for i in range (len(sum)-1):
        if (a == sum[i+1]):
            e = 0
    if (b == c):
        f = 0
    if (b == a):
        f = 0
    for i in range (len(sum)-1):
        if (c == sum[i]):
            g = 0
    d = e + f + g
    return d
    
            

def array123(fuh):
    
    for i in range (len(fuh) - 2):
        if (fuh[i] == 1):
            if (fuh[i+1] == 2):
                if (fuh[i+2] == 3):
                    return True
    return False

def arrayfront9(dun):
    a = 0
    for i in range (4):
        a = dun[i]
        if (a == 9):
            return True
    return False

def stringbits(pah):
    a = ""
    p = 0
    for i in range(len(pah)):
        p = p + 1
        if (p % 2 == 0):
            a = a + ""
        else:
            a = a + pah[i]
    return a
        

def notstring(word):
    s = ""
    for i in range(len(word)):
        s = s + word[i]
        if (s == "not"):
            return word
    s = "not " + word
    return s

def makes10(q, w):
    if (q == 10):
        return True
    if (w == 10):
        return True
    if (q + w == 10):
        return True
    return False

def diff21(n):
    y = 0
    if (n > 21):
        y = 21 - n
        y = y * 2
        return y
    y = 21 - n
    return y

def stringsplosion(st):

    finalS = ""

    for i in range(len(st)):
        for k in range(i+1):
            finalS = finalS + st[k]
    return finalS

def sumdouble(number1, number2):
    a = 0
    if (number1 == number2):
        a = number1 + number2
        a = a * 2
        return a
    a = number1 + number2
    return a
    

def sleepin(weekday, vacation):

    if (not weekday):
        return True
    else:
        if (vacation):
            return True
        
    return False
def main():

    print(" ")

    print(sleepin(False, False))
    print(sleepin(True, False))
    print(sleepin(False, True))

    print(" ")

    print(sumdouble(1, 1))
    print(sumdouble(1, 5))

    print(" ")

    print(diff21(3))
    print(diff21(22))

    print(" ")

    print(makes10(5,5))
    print(makes10(10,5))
    print(makes10(5,10))
    print(makes10(5,2))

    print(" ")

    print(notstring("not me"))
    print(notstring("yeah me"))

    print(" ")

    print(stringbits("yup"))
    print(stringbits("ILikePineapples"))

    print(" ")

    print(arrayfront9([1,1,1,1,1,1]))
    print(arrayfront9([2,3,4,9]))
    print(arrayfront9([2,3,4,4,4,9]))

    print(" ")

    print(stringsplosion("hell yeah"))

    print(" ")

    print(array123([0,0,1,2,3]))
    print(array123([9,2,3,1]))

    print(" ")

    print(lonesum(1,2,1))
    print(lonesum(1,1,2))
    print(lonesum(2,1,1))
    print(lonesum(1,1,1))
    print(lonesum(2,1,3))

    print(" ")

    print(SUM([5, 6, 5, 5, 1]))
    print(SUM([1, 6, 55, 5, 1]))

    print(" ")

    print(LOI([1, 2, 0, 2, 4], 8))
    print(LOI([1, 2, 0, 2, 7], 9))
    print(LOI([1, 3, 5], 10))
    print(LOI([1, 0, 0, 0, 7], 8))

    print(" ")
if __name__ == "__main__":
    main()
