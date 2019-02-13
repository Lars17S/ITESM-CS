#include "iostream"
#include "vector"
using namespace std;
long long gcd(long long n, long long m);


int main() {
  long long numCases, smallerValues, inputN, inputK;
  long long i, j;
  vector <long long> valueN;
  vector <long long> valueK;

  do {
    cin >> inputN;
    cin >> inputK;
    valueN.push_back(inputN);
    valueK.push_back(inputK);
  } while(inputN != -1 || inputK != -1);

  cout << endl;
  for (i = 0, j = 1; i < (valueN.size() - 1); ++i) {
    smallerValues = 0;
    numCases = ((valueN.at(i) - 1) * valueN.at(i)) / 2; //Sum n(n+1)/2, but n = n - 1
    j = 1;
    while((valueK.at(i) - 2 * j) > 0) {
      smallerValues += (valueK.at(i) - 2 * j);
      ++j;
    }
    if (smallerValues > 1)
      cout << smallerValues/gcd(numCases, smallerValues) << '/' << numCases/gcd(numCases, smallerValues) << endl;
    else if(smallerValues == 0)
      cout << 0 << endl;
    else if(smallerValues == 1)
      cout << 1 << endl;
  }

  return 0;
}

long long gcd(long long n, long long m) {
  if (m == 0)
    return n;
  else
    gcd(m, n%m);
}
