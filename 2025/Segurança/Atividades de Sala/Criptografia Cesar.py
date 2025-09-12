escolha = 9
while escolha != 0:
    print("CRIPTOGRAFIA DE CÉSAR")

    escolha = input("1 - Criptografar\n2 - Descriptografar\n0 - Sair\n")
    if escolha == "0":
        break
        
    texto = input("Digite o texto: ").lower()
    numero = int(input("Digite a passagem (deslocamento): "))
    alfabeto = "abcdefghijklmnopqrstuvwxyz"
    resultado = ""

    for letra in texto:
        if letra in alfabeto:
            posicao = alfabeto.index(letra)
            if escolha == "1":
                nova_posicao = (posicao + numero) % len(alfabeto)
            else:
                nova_posicao = (posicao - numero) % len(alfabeto)
            resultado += alfabeto[nova_posicao]
        else:
            resultado += letra

    print("Resultado:", resultado)
    print("-------------------------------------\n")
