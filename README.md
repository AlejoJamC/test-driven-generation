# test-driven-generation
kotlin implementation of the PoC original created by @BoukeNijhuis/test-driven-generation

## TODO
- Implement LangChain tool
- Implement Crew.ai
- Test Code-llama LLM coding
- Test Claude LLM for coding
- Test Llama3.3 70b - The problem the size is 42GB ⚠️

Resources:

- Using plain Java or in this case Kotlin [langchain4j](https://github.com/langchain4j/langchain4j)
- Explore the use of [Spring-AI](https://spring.io/projects/spring-ai)


## Miscellaneous

### Install and Run Ollama local
- Installation in MacOS
- //TODO: Pending add the key commands to install Ollama and run at least llama3.2

- //TODO: Install and run [code-llama](https://ollama.com/library/codellama) in local.

- To run the ollama and llama3.2 in your local terminal this is the command:

`ollama run llama3.2`

- Command to exit the prompt of llama3.2

`/bye`

----
## Top Backend Languages 
This section contains resources and thoughts about with languages and backend frameworks should be consider for my next GenAI implementation.
Java/JVM and Kotlin is taking for granted, because this is the main reason of create this repo. It's well known that java is a mature
language used in the enterprise world with strong frameworks like Spring Boot.

### Python
Python is the facto standard for AI and Machine learning (ML). All the popular frameworks like Tensorflow, Pytorch and Scikit-learn are Python Native.
Even new platform implementation like [Huggingeface Transformer](https://github.com/huggingface/transformers).

### Javascript/TypeScript (Node.js)
Node.js has taken over the world in the last decade mainly for lightweight, scalable and real-time backend application.
Typescript introduced static typing and support for new backend libraries that today represet Ai integrations like Tensorflow.js
The fullstack side of javascript would be a benefit factor to invest in create SDK integration with modern fronted applications.

### Go (Golang)
Go is optimized for performance, concurrency and simplicity, it is a decisive tool for distributed workdload and processing of large amount of data.
In this context, for Ai datasets and It also has implementations in the ML branches like Gorgonia. Possible use cases,
High-performance microservices for AI processing. Scalable APIs for pre-trained models. Real-time data processing infrastructure.

### Rust
Rust is making waves and quickly gaing some traction in the developer's world for speed, safety, and memory efficiency.
Today's players like HuggingFace are using it for building robust AI infrastructure, secure and reliable AI SDKs and managing 
large-scale LLMs in production. Also AI for tasks like model inference and handling large datasets efficiently.
