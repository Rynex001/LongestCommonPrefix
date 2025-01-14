str = ["flower", "flight", "flow"]
charArray = [0] * len(str)
newString = ""

for i in range (len(str)):
    minimumLengthWord = str[0]
    if minimumLengthWord > str[i]:
        minimumLengthWord = str[i]
for i in range(len(minimumLengthWord)):
    flag = 0
    for j in range(len(str)):
        extractedString = str[j]
        charArray[j] = extractedString[i]
    for k in range(1, len(charArray)):
        character = charArray[0]
        if character != charArray[k]:
            flag = 1
    if flag == 0:
        newString += character

print(newString)
