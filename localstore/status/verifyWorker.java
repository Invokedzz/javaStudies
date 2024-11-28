package localstore.status;

import localstore.entities.enums.WorkerStatus;

public class verifyWorker {

    private static WorkerStatus verifyWorkerStatus (char periodChoice) {

        return switch (periodChoice) { // This is called "enhanced switch"

            case 'd' | 'D' -> { // Instead of ':'

                System.out.println("Daytime \n");

                yield WorkerStatus.DAY_TIME; // Yield seems like a type of return;

            }

            case 'a' | 'A' -> {

                System.out.println("Afternoon \n");

                yield WorkerStatus.AFTERNOON;

            }

            case 'n' | 'N' -> {

                System.out.println("Nighttime \n");

                yield WorkerStatus.NIGHT_TIME;

            }

            default -> {

                System.out.println("Not registered");

                yield WorkerStatus.NOT_REGISTERED;

            }

        };

    }

    public static WorkerStatus displayWorkerStatus (char periodChoice) {

        return verifyWorkerStatus(periodChoice);

    }

}
