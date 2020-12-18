# Programme to implement Ceaser Cipher
userVal = input("Enter your data : ")
subVal = int(input("Enter Substitute Value : "))
subVal-=1
encryptedData = ""
for i in range(len(userVal)):
    decValue = ord(userVal[i])
    if decValue != 32:
        if decValue >= 97 and decValue <= 99:
            num = subVal-(decValue-97)
            decValue = ord('z')-num
        elif decValue >= 65 and decValue <= 67:
            num = subVal-(decValue-65)
            decValue = ord('Z')-num
        else:
            decValue = decValue - subVal
    encryptedData += chr(decValue)
print("Encrypted Data : ", encryptedData)