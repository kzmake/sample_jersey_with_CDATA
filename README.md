Sample: JAXB Marshalling Unmarshalling with CDATA
================================================

Table of Contents
-----------------

* [Description](#description)
* [Requirements](#requirements)
* [Usage](#usage)

Description
-----------

Sample code: JAXB Marshalling Unmarshalling with CDATA

Requirements
------------

* java
* gradle

Usage
-----

1. Install
    ```bash
    git clone https://github.com/o-hayato/sample_jersey_with_CDATA.git
    cd sample_jersey_with_CDATA/
    ```

2. Run sample code
    ```bash
    gradle jettyRun
    ```

3. Access `http://localhost:12345/sample-api/foo`

4. Get response below
    ```xml
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <sampleRes>
      <cdataName><![CDATA[<h1>name(with cdata)</h1>]]></cdataName>
      <name>&lt;h1&gt;name(no cdata)&lt;/h1&gt;</name>
    </sampleRes>
    ```

