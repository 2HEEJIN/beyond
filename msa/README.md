## 마이크로 서비스 아키텍처(MicroService Architecture, MSA)
### 1. 소프트웨어 아키텍처(Software Architecture)
* 소프트웨어 아키텍처는 소프트웨어 시스템의 구조와 구성 요소 간의 관계를 정의하는 것이다.
* 좋은 소프트웨어 아키텍처는 시스템의 유지보수성, 확장성, 성능, 안정성을 높일 수 있고 시스템의 취약점을 미리 파악하고, 이에 대한 대비책을 마련할 수 있다.
### 2. 모놀리스 아키텍처(Monolith Architecture)
* 모놀리스 아키텍처는 소프트웨어를 구성하는 모든 요소들을 한 프로젝트에서 관리한다.
* 모놀리스 아키텍처에서 애플리케이션은 배포 가능한 하나의 산출물로 생성되는데 중소 규모의 애플리케이션은 모놀리스 아키텍처 형태로 구축된다.
* 초기 단계에서 구축 및 배포가 쉽다는 장점이 있다.
* 애플리케이션이 복잡해지면 관리가 어려워지고 특정 기술에 종속될 가능성이 높아 새로운 기술의 도입이 어렵다.
* 작고 단순한 애플리케이션의 경우 모놀리스 아키텍처가 적합할 수 있다.
### 3. 마이크로 서비스 아키텍처(MicroService Architecture)
* 애플리케이션을 작고 독립적인 서비스들로 분리하여 개발하고 배포하는 방식이다.
* 마이크로 서비스 아키텍처에서 서비스들은 독립적으로 빌드, 배포, 테스트가 가능하다.
* 즉, 마이크로 서비스 아키텍처로 구축된 서비스들은 다양한 언어와 기술로 구현될 수 있다.
* 장점
  * 각 서비스들은 독립적으로 확장할 수 있다.
  * 각 서비스들은 서비스에 맞는 기술을 선택하여 개발할 수 있다.
  * 각 서비스들은 별도로 배포할 수 있어 빠른 개발 주기와 지속적인 배포가 가능하다.
  * 서비스 간의 결합도가 낮아 특정 서비스에 대한 변경이 다른 서비스에 미치는 영향을 최소화할 수 있다.
  * 각 팀이 특정 서비스를 책임지고 개발할 수 있어 팀의 자율성을 높이고 개발 생산성을 향상시킬 수 있다.
* 단점
  * 여러 개의 서비스를 관리해야 하므로 시스템의 복잡성이 증가한다.
  * 각 서비스를 별도로 관리해야 하므로 운영 비용이 증가한다.
  * 서비스 간의 의존성을 관리하고 테스트하기가 복잡하다.
  * 서비스 간 통신에 따른 성능 저하가 발생할 수 있다.
* 마이크로 서비스를 구축할 때 고려해야 할 사항
  * 적정 규모(right-sized)
    * 마이크로 서비스가 너무 많은 책임을 지지 않도록 적절한 마이크로 서비스 크기를 유지해야 한다.
    * 적절한 크기의 서비스를 이용하면 애플리케이션을 신속히 변경할 수 있고 전체 애플리케이션에 대한 전반적인 위험을 줄일 수 있다.
  * 위치 투명성(location transparent)
    * 서비스 호출에 대한 물리적 상세 정보를 관리하는 방법이다.
    * 마이크로 서비스 애플리케이션에서 다수의 서비스 인스턴스가 빠르게 시작하고 종료될 수 있다.
  * 회복성(resilient)
    * 실패한 서비스를 우회하고 빠른 실패 방식을 적용하여 마이크로 서비스 소비자와 애플리케이션의 전반적인 무결성을 보호하는 방법이다.
  * 반복성(repeatable)
    * 서비스의 모든 새 인스턴스가 시작할 때 운영 환경의 다른 서비스와 동일한 구성과 코드 베이스를 보장하는 방법이다.
  * 확장성(scalable)
    * 서비스 간 직접적인 종속 관계를 최소화하고 마이크로 서비스를 적절히 확장할 수 있도록 통신 방식을 구축하는 방법이다.
## 클라우드 네이티브 마이크로 서비스 구축 방법
### 1. 클라우드(Cloud)
* 클라우드는 특정 장소가 아니라 가상의 인프라스트럭처를 사용하여 로컬 머신과 사설 데이터 센터를 대체할  수 있는 기술과 자원의 관리 시스템이다.
### 2. 클라우드의 유형  
* 클라우드 레디(Cloud Ready)는 온프레미스 환경에서 개발된 애플리케이션을 클라우드 환경에서 실행될 수 있도록 준비된 애플리케이션을 의미한다.
* 클라우드 네이티브(Cloud Native)는 클라우드 환경에서 실행되도록 처음부터 설계된 애플리케이션을 의미한다.
### 3. 12 팩터 앱(twelve-factor app)
* 헤로쿠 개발자가 만든 방법론으로 마이크로 서비스 구축을 위한 12가지 모범 사례를 제공한다.
* 각 마이크로 서비스는 소스 제어 가능한 단일 코드 베이스를 가진다.
* 애플리케이션이 메이븐이나 그레이들 같은 자바용 빌드 도구로 사용되는 의존성을 선언해야 한다.
* 구성 정보를 배포할 마이크로 서비스와 완전히 분리해서 관리해야 한다.
* 마이크로 서비스는 데이터베이스나 REST API, 다른 서비스, 메시징 시스템 등과 네트워크로 통신한다.
* 실행할 환경에 독립적으로 마이크로 서비스를 구축해야 한다
* 마이크로 서비스는 항상 무상태(stateless)가 되어야 하며 요청받은 트랜잭션을 수행하는 데 필요한 정보만 포함해야 한다.
* 서비스는 노출된 HTTP 포트를 사용하여 바로 액세스 되어야 한다.
* 확장이 필요하다면 수직 확장 대신 더 많은 인스턴스를 시작해서 수평 확장해야 한다.
* 다른 서비스에 영향을 주지 않고 새로운 인스턴스로, 실패한 인스턴스를 제거할 수 있다.
* 개발 및 운영 환경 일치시켜 코드가 커밋 되는 즉시 테스트를 거쳐 개발 환경에서 운영 환경에 배포할 수 있어야 한다.
* 출력된 로그를 수집하고 중앙 저장소에 기록하여 관리해야 한다.
* 개발자는 데이터 이전이나 변환 같은 서비스 관리 작업을 해야 한다.
## 스프링 클라우드(Spring Cloud)
### 1. 스프링 클라우드(Spring Cloud)
* 스프링 클라우드는 최소한의 구성으로 마이크로 서비스 아키텍처를 빠르게 구축할 수 있는 기능들을 제공한다.
* 스프링 클라우드는 프로젝트 설정 및 구성을 단순화하고 가장 흔히 접할 수 있는 패턴의 해결안을 스프링 애플리케이션에 제공한다.
### 2. 스프링 클라우드 컨피그(Spring Cloud Config)
* 스프링 클라우드 컨피그 서버는 스프링 부트로 만든 REST 기반의 애플리케이션이다.
* 스프링 클라우드 컨피그는 애플리케이션의 설정 데이터를 애플리케이션에서 분리시키고 관리하는 역할을 한다.
  * 많은 마이크로 서비스 인스턴스를 실행하더라도 항상 동일한 구성을 보장할 수 있다.
  * 설정 데이터가 실행 중 전달되어 동일한 서버와 애플리케이션이 모든 환경에 일관된 방식으로 동작시킬 수 있다
#### 2.1. 스프링 클라우드 컨피그 서버 구축
* 스프링 클라우드 컨피그 서버를 구축하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>
  ```
* `bootstrap.yml` 파일에 스프링 클라우드 컨피그 서버 실행에 필요한 설정들을 해야한다.
  ```yml
  server:
    port: 8888
  spring:
    application:
      name: config-server
    profiles:
      active:
      - git
    cloud:
      config:
        server:
          git:
            uri: # git 저장소 주소
            search-paths:
            - # 설정 파일 경로
            ignoreLocalSshSettings: true
            hostKey: # 호스트 키 지정
            hostKeyAlgorithm: # 공개 키 알고리즘 지정 
            privateKey: | # 비공개 키 지
              -----BEGIN OPENSSH PRIVATE KEY-----
              ...
              -----END OPENSSH PRIVATE KEY-----
  ```
* 실행 클래스에서 `@EnableConfigServer` 어노테이션으로 스프링 클라우드 컨피그 서버를 활성화한다. 
  ```java
  @SpringBootApplication
  @EnableConfigServer 
  public class Application {
    public static void main(String[] args) {
      SpringApplication.run(ConfigApplication.class, args);
    }
  }
  ```
* `bootstrap.yml` 파일에 지정한 Git 저장소에 애플리케이션 이름과 환경별로 구성할 설정 파일을 생성한다.
  * `app-name.properties` 또는 `app-name.yml`
  * `app-name-env.properties` 또는 `app-name-env.yml`
* 생성한 설정 파일을 읽어오려면 브라우저 주소창에 `localhost:8888/app-name/default` 또는  `localhost:8888/app-name/env`와 같이 입력하면 된다.
#### 2.2. 스프링 클라우드 컨피그 클라이언트 구축
* 스프링 클라우드 컨피그 클라이언트를 구축하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>
  ```
* `bootstrap.yml` 파일에 스프링 클라우드 컨피그 서버의 위치를 알려주어야 한다.
  ```yml
  spring:
    application:
      name: config-client
  cloud:
    config:
      uri:
      - http://localhost:8888
  ```
* 위의 설정 후 클라이언트 애플리케이션을 실행하면 스프링 클라우드 컨피그 서버에서 설정 정보를 받아온 후 클라이언트 애플리케이션을 실행한다.
### 3. 스프링 서비스 디스커버리(Spring Cloud Discovery)
#### 3.1. 서비스 디스커버리(Service Discovery)
* 서비스 디스커버리를 사용하면 서비스를 소비하는 클라이언트에서 서버가 배포된 물리적 위치(IP 및 서버 이름)를 추상화할 수 있다.
* 서비스 디스커버리의 주요 목표는 서비스의 물리적 위치를 수동으로 구성할 필요 없이 위치를 알려줄 수 있는 아키텍처를 구축하는 것이다.
* 즉, 서비스 소비하는 클라이언트에서 물리적 위치가 아닌 논리적 이름을 사용하여 서버의 비즈니스 로직을 호출한다.
#### 3.2. 넷플릭스 유레카(Netflix Eureka) 서버 구축
* 스프링 클라우드와 넷플릭스 유레카의 서비스 디스커버리 엔진을 사용하여 서비스 디스커버리 패턴을 구현할 수 있다.
* 넷플릭스 유레카 서버를 구축하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>
  ```
* `bootstrap.yml` 파일에 스프링 클라우드 컨피그 서버의 위치를 알려주어야 한다.
  ```yml
  spring:
    application:
      name: eureka-server
    cloud:
      config:
        uri:
        - http://localhost:8888
  ```
* 스프링 클라우드 컨피그에서 지정한 Git 저장소에 설정 파일을 생성한다.
  ```yml
  # eureka-server.yml
  server:
    port: 8761
  eureka:
    instance:
      # 유레카 인스턴스에 호스트 이름을 설정한다.
      hostname: localhost
    client:
      # 유레카 서버가 유레카 서비스에 등록되지 않도록 한다.
      register-with-eureka: false
      # 유레카 서버가 캐시 레지스트리 정보를 로컬에 캐시하지 않도록 지시한다.
      fetch-registry: false
      # 서비스 URL을 설정한다.
      service-url: 
        defalut-zone: "http://${eureka.instance.hostname}:${server.port}/eureka/"
  ```
* 실행 클래스에서 `@EnableEurekaServer` 어노테이션으로 유레카 서버를 활성화한다. 
  ```java
  @SpringBootApplication
  @EnableEurekaServer
  public class Application {
    public static void main(String[] args) {
      SpringApplication.run(ConfigApplication.class, args);
    }
  }
  ```
#### 3.2. 넷플릭스 유레카(Netflix Eureka) 클라이언트 구축
* 넷플릭스 유레카 클라이언트를 구축하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>
  ```
* `bootstrap.yml` 파일에 `spring.application.name` 프로퍼티가 설정되었는지 확인한다.
  ```yml
  spring:
    application:
      name: eureka-client
  ...
  ```
* 클라이언트를 유레카에 등록할 수 있도록 Git 저장소의 설정 파일에 아래의 내용을 추가한다.
  ```yml
  # eureka-client.yml
  eureka:
    instance:
      # 서비스 이름 대신 서비스 IP 주소 등록
      prefer-ip-address: true
    client:
      # 유레카 서비스 등록 여부
      register-with-eureka: true
      # 레지스트리 사본을 로컬에 내려받기
      fetch-registry: true
      # 유레카 서비스 위치 설정
      service-url:
        defalue-zone: http://localhost:8761/eureka/
  ```
  ### 4. 스프링 클라우드 게이트웨이(Spring Cloud Gateway)
  #### 4.1. 서비스 게이트웨이(Service Gateway)
  * 서비스 게이트웨이는 클라이언트와 호출되는 서비스 사이에서 중개 역할을 한다. 
  * 클라이언트는 각 서비스 URL을 직접 호출하지 않고 서비스 게이트웨이를 통해 서비스와 통신한다.
  * 서비스 호출의 중앙 집중화로 보안 인가, 인증, 콘텐츠 필터링과 라우팅 규칙 등 표준 서비스 정책을 시행할 수 있다.
  #### 4.2. 스프링 클라우드 게이트웨이(Spring Cloud Gateway) 구축
  * 스프링 클라우드 게이트웨이를 구축하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-gateway</artifactId>
  </dependency>
  ```
* `bootstrap.yml` 파일에 스프링 클라우드 컨피그 서버의 위치를 알려주어야 한다.
  ```yml
  spring:
    application:
      name: gateway-server
    cloud:
      config:
        uri:
        - http://localhost:8888
  ```
* 스프링 클라우드 컨피그에서 지정한 Git 저장소에 설정 파일을 생성한다.
  ```yml
  # gateway-server.yml
  server:
    port: 8000
  eureka:
    instance:
      prefer-ip-address: true
    client:
      register-with-eureka: true
      fetch-registry: true
      service-url:
        default-zone: http://localhost:8761/eureka/
  ```
* 게이트웨이에 유입된 호출이 해당 서비스로 매핑하려면 설정 파일에 추가로 설정을 작성해야 한다.
  ```yml
  spring:
    cloud:
      gateway:
        routes:
        - id: department-service
          uri: lb://department-service
          predicates:
          - Path=/department/**
          filters:
          - RewritePath=/department/(?<path>.*), /$\{path}
  ```
