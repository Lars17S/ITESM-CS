#include "iostream"
#include "string"
using namespace std;

int main() {
  string inputNum;
  int binaryDigit[8] = {128, 64, 32, 16, 8, 4, 2, 1};
  int binaryNum[8];
  int num[4];
  int dotPos, i, j;

  cout << "Input IP address (xxx.xxx.xxx.xxx): ";
  cin >> inputNum;
  inputNum.push_back('.'); //Just to avoid bugs at the end of loop finding a dot

  cout << "Output IP address: ";
  for (i = 0; i < 4; ++i) { //Sé cuántas veces iterar
    dotPos = inputNum.find('.');
    num[i] = stoi(inputNum.substr(0, dotPos)); //substr(index, number of characters to subtract), if not specified, then subtract to the end
    inputNum = inputNum.substr(dotPos + 1);

    for (int t = 0; t < 8; ++t) // Refresh [0, 0, 0, 0, 0, 0, 0, 0]
      binaryNum[t] = 0;

    j = 0;
    while(num[i] != 0) { //To found when there are not more numbers
      while(num[i] < binaryDigit[j]) //Scan where is the position of the 2^j such that num[i] > 2^j to substract this number
        j = j + 1;
      num[i] = num[i] - binaryDigit[j];
      binaryNum[j] = 1; //Modify the current position of the array, i.e. [0, 0, 1, 0, 1, 0, 0, 0]
    }

    for (int k : binaryNum)
      cout << to_string(k);
  }
  return 0;
}
