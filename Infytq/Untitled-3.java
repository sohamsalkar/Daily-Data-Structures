//ArrayList<Integer> list = new ArrayList<Integer>();

/* temp = Character.getNumericValue(A.charAt(i));
            list.add(temp);
            System.out.println(temp); */


            if( Integer.parseInt(vals.substring(0, i)) + Integer.parseInt(vals.substring(i))  == sum  )
                
            else
                return ( 1 + kiti(vals.substring(i), sum - Integer.parseInt(vals.substring(0, i)) , i))
            