def forecast(days):

    rain = 0
    sunshine = 0
    snow = 0

    for item in days:
        if item == "snow":
            snow += 1
        elif item == "sunshine":
            sunshine += 1
        elif item == "rain":
            rain += 1

    print(snow)
    print(sunshine)
    print(rain)

    if rain > sunshine and rain > snow:
        return "rain"
    elif sunshine > rain and sunshine > snow:
        return 'sunshine'
    elif snow > rain and snow > sunshine:
        return 'snow'
    elif snow == rain == sunshine:
        return days[len(days) - 1]
    elif snow == rain and snow > sunshine and rain > sunshine:
        return 'sunshine'
    elif snow == sunshine and snow > rain and sunshine > rain:
        return 'rain'
    elif sunshine == rain and sunshine > snow and rain > snow:
        return 'snow'