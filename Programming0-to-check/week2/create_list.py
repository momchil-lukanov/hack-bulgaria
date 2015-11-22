languages = ["Python", "Ruby"]
languages += ["C++", "Java", "C#"]
print(languages)
languages = ["Haskell"] + languages
print(languages)
languages = languages + ["Go"]
print(languages)

print(languages[0])
print(languages[1])
print(languages[4])
languages[3] = "F#"
print(languages)
print(languages[len(languages)-1])

if "Haskell" in languages:
    print(True)

if "Ruby" in languages:
    print(True)

if "Go" in languages:
    print(True)
    
if "Rust" not in languages:
    print(False)
    
