import java.util.Comparator;
import java.util.PriorityQueue;


class Patient {

    String name;
    int age;
    int severity;

    
    Patient(String name, int age, int severity) {
        this.name = name;
        this.age = age;
        this.severity = severity;
    }
}

public class HospitalEmergency {

    public static void main(String[] args) {

        
        Comparator<Patient> patientComparator = new Comparator<Patient>() {

            @Override
            public int compare(Patient p1, Patient p2) {

        
                if (p2.severity != p1.severity) {
                    return p2.severity - p1.severity;
                }

        
                return p2.age - p1.age;
            }
        };

        
        PriorityQueue<Patient> pq =
                new PriorityQueue<>(patientComparator);

        
        pq.add(new Patient("Rahul", 25, 4));
        pq.add(new Patient("Amit", 60, 5));
        pq.add(new Patient("Neha", 40, 3));
        pq.add(new Patient("Priya", 65, 5));
        pq.add(new Patient("Karan", 30, 2));

        
        System.out.println("Order of Patient Treatment:\n");

        while (!pq.isEmpty()) {

            Patient p = pq.poll();

            System.out.println(
                    "Name: " + p.name +
                    ", Age: " + p.age +
                    ", Severity: " + p.severity
            );
        }
    }
}