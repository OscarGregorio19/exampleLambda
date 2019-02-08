package com.aouhi.rai.lambda;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.model.Request;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.List;

public class LambdaHandler extends SpringBootRequestHandler<Request, List<TaNews>> {

}
