
def largestAltitude(gain):
    """
    :type gain: List[int]
    :rtype: int
    """
    # initialize a variable to store the end output
    result = 0
    # initialize a variable to keep track of the altitude at each iteration
    current_altitude = 0
    # looping through each of the gains
    for g in gain:
        # updating the current altitude based on the gain
        current_altitude += g
        # if the current altitude is greater than the highest altitude recorded then assign it as the result. This done iteratively, allows us to find the highest altitude
        if current_altitude > result:
            result = current_altitude
    return result


print(largestAltitude([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
