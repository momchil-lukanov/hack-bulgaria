def count_vowels_consonant(word):

    dict = {"vowels":0,
            "consonants":0}

    vowels = "aeiouyAEIOUY"
    consonants = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ"

    for char in word:
        if char in vowels:
                dict["vowels"] += 1
        elif char in consonants:
                dict["consonants"] += 1
                
    return dict

a = count_vowels_consonant("radorado")
print(a)
