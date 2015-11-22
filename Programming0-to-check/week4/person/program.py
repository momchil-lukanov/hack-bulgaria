person = {}
person["first_name"] = input()
person["second_name"] = input()
person["third_name"] = input()
person["birth_year"] = int(input())
person["current_age"] = 2015 - person["birth_year"]
print(person)
