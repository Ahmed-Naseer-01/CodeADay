play_1_score = 0
play_2_score = 0

def minion_game(string):
    length_of_string = len(string)
    turn = 1
    selected = []
    play_1_score = 0
    play_2_score = 0
    vowels = "AEIOU"

    for i in range(length_of_string):
        # player 1
        if turn == 1:
            print("Select a letter")
            play_input = input()
            if play_input not in string or play_input in selected:
                print("Try again next time")
                turn = 2
                continue
            if play_input not in vowels:
                print("Now make substring")
                play_1_substring = input("Enter")
                play_1_count = string.count(play_1_substring)
                play_1_score += play_1_count
                turn = 2
                
        # player 2
        elif turn == 2:
            print("Select a letter")
            play_input_2 = input()
            if play_input_2 not in string or play_input_2 in selected:
                print("Try again next time")
                turn = 1
                continue
            elif play_input_2 in vowels :
                print("Now make substring")
                play_2_substring = input("Enter")
                play_2_count = string.count(play_2_substring)
                play_2_score += play_2_count
                turn = 1

    print("Score of player 1: {0} \n".format(play_1_score))
    print("Score of player 2: {0} \n".format(play_2_score))
string=input("Enter any string : ")
string=string.upper()
minion_game("string")

