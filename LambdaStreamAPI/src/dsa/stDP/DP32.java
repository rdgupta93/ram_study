package dsa.stDP;

public class DP32 {
    public static void main(String[] args) {
      /*
      Regex matching
        Given text t and pattern p check both are same or not
        T -> In text it contains alphabet
        P->with alphabet ,it contains ?,*
        ?-> it can match any 1 character
        *->it can match any number of continuous characters,{0,1,2,3..}

        ex1 : T: a p p l e
              P: a ? * e      matched ? ->P  and *->p l
        ex2:  T: a p p l a e
              P: a * a ?       not matched  x -> matched ppl and e not matched
        ex3:  T: a n t
              P: a ? * * t   matched
        ex4: T:""
             P: * * * *      matched
        ex5: T:""
             P:""             matched
        ex6: T: c d b
             P: a *         not matched


                             T: e l p p a
                             P: e ? * a

                             Reg(T[0-4] P[0-3])
                                T[0]==P[0]
                              Reg(T[1-4] P[1-3])
                                 P[1]==?
                                 Reg(T[2-4] P[2-3])
                                P[2] ==*
             caseI- not matching leave it           match it and stay there
             Reg(T[2-4] P[3-3])                       Reg(T[3-4] P[2-3])
       */
    }
}
