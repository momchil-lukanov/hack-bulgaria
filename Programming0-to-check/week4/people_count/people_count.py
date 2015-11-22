def get_people_activity(activity):

    list = []

    for person in activity:
        if person not in list:
            list += [person]

    return len(list)

a = get_people_activity(["Rado", "Ivo", "Maria", "Anneta", "Rado", "Rado", "Anneta", "Ivo", "Maria", "Rado"])
print(a)
