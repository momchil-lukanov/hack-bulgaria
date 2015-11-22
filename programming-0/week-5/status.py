def status_count(students):

    dict = {"finalized": [],
            "not_finalized": []}     

    for student in students:
        name = student["name"]
        if student['status'] == "not_finalized":
            dict["finalized"] += [name]
        elif student['status'] == "finalized":
            dict["not_finalized"] += [name]

    return dict

a = status_count([{
              "name": "RadoRado",
              "status": "not_finalized"
            }, {
              "name": "Ivo",
              "status": "finalized"
            }, {
              "name": "Genadi",
              "status": "finalized"
            }, {
              "name": "Ani",
              "status": "not_finalized"
            }])
print(a)
