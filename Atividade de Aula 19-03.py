Numero=int(input("Digite o valor a ser avaliado: "))

if Numero<0:
    print("O resultado é", Numero*-1)
else:
    if Numero > 0 and Numero <= 20:
        print("O resultado é", Numero*2)
    elif Numero > 20:
        print("O resultado é", Numero)
    else:
        print("O resultado é Zero")
