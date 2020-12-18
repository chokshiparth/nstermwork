#Transpoes Cipher
userData = input("Enter Your Data: ")
dataKey = input("Enter Your Key: ")
lenKey = len(dataKey)
sortedKey = sorted(dataKey)
data = ""
encryptedData = ""

#remove space
for val in userData:
    if val != ' ':
        data += val

lenData = len(data)

#encrypt data
for keyVal in sortedKey:
    index = dataKey.find(keyVal)
    while index < lenData:
        encryptedData += data[index]
        index += lenKey
print(encryptedData)

#decrypt data