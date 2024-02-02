class Solution(object):
    def palindrome(self, s):     #inputs: string s

        day = ""        #a blank string to get rid of spaces and numbers and the like
        for currentLetter in s: #cycle thru the letters in string
            if (currentLetter.isalpha()):   #if its an actual letter
                day += currentLetter        #add it to our letters-only string

        day = day.lower()         #AND LOWER IT god ur so picky
        oppositeday = day[::-1]   #tbh i just looked up "how to reverse string" and i guess this slices it up all fancy lol. then i save it as opposite day

        if (oppositeday == day) : #if it still equals the og string then yayyyy woohooooo
            return(True)

        return(False)       #else, return false :(

    #ughhhh the cycling thru and making sure all the letters r lowercase is such a painnnnnn


test = Solution()
print("tacocat being a palindrome is", test.palindrome("tacocat"))
print("burritocat being a palindrome is", test.palindrome("burritocat"))
print("Xx_TACoCAT_xX, which sounds like a username I'd see on Scratch, being a palindrome is", test.palindrome("Xx_TACoCAT_xX"))
