def count_occurrences(search_word, words):

    result = 0

    for word in words:
        if word == search_word:
            result += 1

    return result

def count_words2(words):

    result = {}

    for word in words:
        result[word] = count_occurrences(word, words)

    return result

a = count_words2(["words", "are", "meaningful", "words", "words", "are"])
print(a)

def count_words(words):

    dict = {}
    
    for word in words:
        if word not in dict:
            dict[word] = 1
        else:
            dict[word] += 1

    return dict

a = count_words(["words", "are", "meaningful", "words", "words", "are"])
print(a)
