#include <iostream>
#include <stack>
using namespace std ; 
stack<char> balanced_parenth; 

char openings [3] = {'(','{','['};
void check_balaanced_parenth(string exp) {
    // if (exp.length()==1){
    //     cout<<"Invalid"<<endl;
    //     return ;
    // }
    for (int i = 0 ; i<exp.length(); i++) {
        if (exp[i] == '{' ||exp[i] == '[' || exp[i] == '(' ) {
            balanced_parenth.push(exp[i]);
        } else {
            balanced_parenth.pop();
        }
    }
}
int main () {
string expression = "]";
// The algorithm: if opening

check_balaanced_parenth(expression);
if (balanced_parenth.empty()) {
    cout<<"Expression is balanced"<<endl;
} else {
    cout<<"Expression is not balanaced"<<endl;
}
}