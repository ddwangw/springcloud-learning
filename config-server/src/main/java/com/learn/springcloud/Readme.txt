searchPaths: /config-repo 
searchPaths: config-repo
如上配置好使，/config-repo/** 不好用，可以多配置尝试几次

另外访问方式不同，获取的数据结果也不一致
http://localhost:7001/didispace/dev
http://localhost:7001/didispace/dev/master
{"name":"didispace","profiles":["dev"],"label":null,"version":"34c4b90cbc0bdf108b0b5d7335b0009fee2d5ad3","state":null,"propertySources":[{"name":"https://github.com/ddwangw/springcloud-learning.git/config-repo/didispace-dev.properties","source":{"version":"dev","age":"18","name":"lisi"}}]}

http://localhost:7001/didispace-dev.properties
age: 18
name: lisi
version: dev

ok 上述内容尝试到这里就可以了

