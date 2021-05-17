def listPotentialStops(destinationList, fTime, mTime, faDestination):
    a = 0
    b = 0
    c = ""
    d = mTime - fTime
    j = 0
    myStops = []
    myDistance = []
    Final = []
    for g in range (len(destinationList)):
        myDistance.append(destinationList[g][1])
        myStops.append(destinationList[g][0])
    for f in range(len(myDistance) - 1):
        for i in range(len(myDistance) - 1):
            if (myDistance[i] > myDistance[i+1]):
                b = myDistance[i]
                myDistance[i] = myDistance[i+1]
                myDistance[i+1] = b
                c = myStops[i]
                myStops[i] = myStops[i+1]
                myStops[i+1] = c

    for g in range (len(myStops)):
        if (myStops[g] == faDestination):
            if (myDistance[g] <= d):
                myStops.remove(myStops[g])
                myStops.insert(0, faDestination)
                j = myDistance[g]
                myDistance.remove(myDistance[g])
                myDistance.insert(0, j)
            
    for i in range(len(myDistance)):
        a = a + myDistance[i]
        if (a < d):
            Final.append(myStops[i])
        if (a >= d):
            return Final

    return Final

def main():
    print("Welcome to the space trip")
    print("")
    pointA = input("Starting point: ")
    print("")
    pointB = input("Ending Point: ")
    print("")
    FT = input("Distance between " + pointA + " and " + pointB + ": ")
    print("")
    maxTime = input("Maximum distance: ")
    print("")
    FT = float(FT)
    maxTime = float(maxTime)
    destinations = [("Venus", 0.7), ("Uranus", 0.9), ("Mars", 0.0), ("Saturn", 0.0), ("Pluto", 0.9)]
    print("Possible destinations: Venus, Uranus, Mars, Saturn, Pluto")
    print("")
    FavDestination = input("Favorite destination: ")
    print("")
    if (FT <= maxTime):
        print("You were able to go to these destinations along the way:")
        print(listPotentialStops(destinations, FT, maxTime, FavDestination))
    else:
        print("You weren't able to go anywhere.")
 

if __name__ == "__main__":
    main()
