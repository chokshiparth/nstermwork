#one time pad programme
userData =input("Enter your data : ")
encryptKey = input("Enter Same length Key : ")
result = ""

#incrypt data
for i in range(len(userData)):
    keyValue = ord(encryptKey[i])
    value = ord(userData[i])
    x = keyValue ^ value
    answer = bin(x)
    j = 2
    while j <= (len(answer)-1):
        result += answer[j]
        j += 1
print("Encrypted bit : ", result)