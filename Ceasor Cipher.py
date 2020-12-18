# Programme to implement Ceaser Cipher
userVal = input("Enter your data : ")
encryptedData = ""
for i in range(len(userVal)):
    decValue = ord(userVal[i])
    if decValue != 32:
        if decValue >= 97 and decValue <= 99:
            num = 2-(decValue-97)
            decValue = ord('z')-num
        elif decValue >= 65 and decValue <= 67:
            num = 2-(decValue-65)
            decValue = ord('Z')-num
        else:
            decValue = decValue - 2
    encryptedData += chr(decValue)
print("Encrypted Data : ", encryptedData)