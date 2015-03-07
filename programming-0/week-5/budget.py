def on_budget(books, budget):

    dict = {"books_on_budget": 0,
            "loan": 0}
    books = sorted(books)
    total_price = sum(books)

    for book in books:
        if book <= budget:
            budget -= book
            total_price -= book
            dict['books_on_budget'] += 1

    dict['loan'] = total_price - budget

    if dict['loan'] < 0:
        dict['loan'] = 0
                    
    return dict

a = on_budget([0, 10, 100, 5, 3, 8, 25], 35)
print(a)
print(on_budget([0, 0, 0], 35))
print(on_budget([50, 60, 100], 20))
