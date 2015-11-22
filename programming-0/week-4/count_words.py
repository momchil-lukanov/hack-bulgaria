def count_words(words):

    dict = {}
    
    for word in words:
        if word in dict:
            dict[word] += 1
        else:
            dict[word] = 1

    return dict

a = count_words(["words", "are", "meaningful", "words", "words", "are"])
print(a)
