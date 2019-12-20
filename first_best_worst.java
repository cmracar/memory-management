// Cemre Acar

package com.company;

public class First_Best_Worst {

    public void first_fit(int[] memory, int lenghtofmemory, int[] processes, int lenghtofprocesses){

        // Memory is our blocks and lenghtofmemory is their size
        //
        //

        // I created an array according to the size of processes
        int[] allocate = new int[lenghtofprocesses];

        for (int i = 0; i < allocate.length; i++)
            allocate[i] = -1;

        // I added and appointed according to their size
        for (int i = 0; i < lenghtofprocesses; i++)
        {
            for (int k = 0; k < lenghtofmemory; k++)
            {
                if (memory[k] >= processes[i])
                {
                    allocate[i] = k;
                    memory[k] -= processes[i];
                    break;
                }
            }
        }

        for (int count = 0; count < lenghtofprocesses; count++)
        {
            System.out.print("\nProcess No = "+(count+1)+"\nProcess Size = "+processes[count]+"\n(Memory)Block No = ");
            if (allocate[count] != -1)
                System.out.print(allocate[count] + 1);
            else
                System.out.print("Doesn't Allocated");
            System.out.println();
        }

    }

    public void best_fit(int[] memory, int lenghtofmemory, int[] processes, int lenghtofprocesses){
        // Memory is our blocks and lenghtofmemory is their size
        //
        //

        // I created an array according to the size of processes
        int[] allocate = new int[lenghtofprocesses];

        for (int i = 0; i < allocate.length; i++)
            allocate[i] = -1;

        for (int count = 0; count < lenghtofprocesses; count++)
        {

            //I'm finding the best block for process
            int forbest = -1;
            for (int k=0; k<lenghtofmemory; k++)
            {
                if (memory[k] >= processes[count])
                {
                    if (forbest == -1)
                        forbest = k;
                    else if (memory[forbest] > memory[k])
                        forbest = k;
                }
            }

            if (forbest != -1)
            {
                allocate[count] = forbest;
                memory[forbest] -= processes[count];
            }
        }

        for (int i = 0; i < lenghtofprocesses; i++)
        {
            System.out.print("\nProcess No = " + (i+1) + "\nProcess Size = " + processes[i] + "\n(Memory)Block No = ");
            if (allocate[i] != -1)
                System.out.print(allocate[i] + 1);
            else
                System.out.print("Doesn't Allocated");
            System.out.println();
        }
    }

    public void worst_fit(int[] memory, int lenghtofmemory, int[] processes, int lenghtofprocesses){
        // Memory is our blocks and lenghtofmemory is their size
        //
        //

        // I created an array according to the size of processes
        int[] allocate = new int[lenghtofprocesses];

        for (int i = 0; i < allocate.length; i++)
            allocate[i] = -1;

        for (int count = 0; count < lenghtofprocesses; count++)
        {
            int forworst = -1;
            for (int k=0; k<lenghtofmemory; k++)
            {
                if (memory[k] >= processes[count])
                {
                    if (forworst == -1)
                        forworst = k;
                    else if (memory[forworst] < memory[k])
                        forworst = k;
                }
            }

            // If I may find memory for process
            if (forworst != -1)
            {
                // allocate k to "count" process
                allocate[count] = forworst;

                memory[forworst] -= processes[count];
            }
        }

        for (int i = 0; i < lenghtofprocesses; i++)
        {
            System.out.print("\nProcess No = " + (i+1) + "\nProcess Size = " + processes[i] + "\n(Memory)Block No = ");
            if (allocate[i] != -1)
                System.out.print(allocate[i] + 1);
            else
                System.out.print("Doesn't Allocated");
            System.out.println();
        }
    }

}
