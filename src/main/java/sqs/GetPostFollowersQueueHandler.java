package sqs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;



public class GetPostFollowersQueueHandler implements RequestHandler<SQSEvent, Void> {

    @Override
    public Void handleRequest(SQSEvent event, Context context) {

        for (SQSEvent.SQSMessage msg : event.getRecords()) {
            System.out.println(msg.getBody());

            // TODO:

            // Add code to print message body to the log

        }

        return null;
    }
}




