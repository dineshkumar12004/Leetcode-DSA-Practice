def finalValueAfterOperations(operations):
    op_dict = {"--X": -1, "X--": -1,
               "++X": 1, "X++": 1}
    return sum(op_dict[op] for op in operations)


res = finalValueAfterOperations(["++X", "++X", "X++"])
print(res)
