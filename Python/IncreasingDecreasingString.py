def sortString(s):
    dict = {
        'a': 0, 'b': 0, 'c': 0, 'd': 0, 'e': 0, 'f': 0,
        'g': 0, 'h': 0, 'i': 0, 'j': 0, 'k': 0, 'l': 0,
        'm': 0, 'n': 0, 'o': 0, 'p': 0, 'q': 0, 'r': 0,
        's': 0, 't': 0, 'u': 0, 'v': 0, 'w': 0, 'x': 0,
        'y': 0, 'z': 0
    }

    # Set the number of occurences of each letter
    # to its corresponding letter in the dict
    for i in s:
        dict[i] = dict[i] + 1

    alpha = "abcdefghijklmnopqrstuvwxyz"
    out = ''
    while len(out) < len(s):

        # part 1 increasing ord value of letters
        for i in range(0, len(alpha)):
            if dict[alpha[i]] > 0:
                out = out + alpha[i]
                dict[alpha[i]] = dict[alpha[i]] - 1

        # decreasing ord value of letters
        for i in range(len(alpha) - 1, -1, -1):
            if dict[alpha[i]] > 0:
                out = out + alpha[i]
                dict[alpha[i]] = dict[alpha[i]] - 1

    return out


ans = sortString("aaaabbbbcccc")
print(ans)
