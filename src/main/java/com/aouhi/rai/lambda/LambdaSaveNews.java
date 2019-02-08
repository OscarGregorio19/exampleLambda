package com.aouhi.rai.lambda;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.model.Response;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class LambdaSaveNews extends SpringBootRequestHandler<TaNews, Response> {
}
