<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta http-equiv="content-type" content="txt/html; charset=utf-8"/>
    <title>Myshop</title>
</head>

<body>

<h1 align="center">喵喵商城</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th class="success" width="20%" style="text-align:center;">名称</th>
        <th class="success" width="20%" style="text-align:center;">单价</th>
        <th class="success" width="20%" style="text-align:center;">商品描述</th>
        <th class="success" width="20%" style="text-align:center;">库存</th>
        <th class="success" width="20%" style="text-align:center;">操作</th>
    </tr>
    </thead>

    <tbody>
    <#list 0..(list!?size-1) as i>
    <tr>
        <td width="20%" style="text-align:center;">${list[i].name!}</td>
        <td width="20%" style="text-align:center;">${list[i].price!}</td>
        <td width="20%" style="text-align:center;">${list[i].intro!}</td>
        <td width="20%" style="text-align:center;">${list[i].stock!}</td>
        <td width="20%" style="text-align:center;"><a href="/delgood?id=${list[i].id}">✘</a></td>
    </tr>
    </#list>
    </tbody>
</table>


<button type="button" class="btn btn-primary" data-toggle="collapse"
        data-target="#shop-car">
    <span class="glyphicon glyphicon-shopping-cart"></span> 您的购物车
</button>

<button type="button" class="btn btn-primary" data-toggle="collapse"
        data-target="#newgood">
    <span class="glyphicon glyphicon-shopping-cart"></span> 增加商品
</button>

<button type="button" class="btn btn-primary" data-toggle="collapse"
        data-target="#delete_goods">
    <span class="glyphicon glyphicon-shopping-cart"></span> 删除商品
</button>

<button type="button" class="btn btn-primary" data-toggle="collapse"
        data-target="#shop-car">
    <span class="glyphicon glyphicon-shopping-cart"></span> 您的购物车
</button>

<div id="shop-car" class="collapse out">
    <table class="table">
        <thead>
        <tr>
            <th align="center">产品</th>
            <th align="center">付款日期</th>
            <th align="center">状态</th>
        </tr>
        </thead>
        <tbody>
        <tr class="active">
            <td>产品1</td>
            <td>23/11/2013</td>
            <td>待发货</td>
        </tr>
        <tr class="success">
            <td>产品2</td>
            <td>10/11/2013</td>
            <td>发货中</td>
        </tr>
        <tr class="warning">
            <td>产品3</td>
            <td>20/10/2013</td>
            <td>待确认</td>
        </tr>
        </tbody>
    </table>
</div>

<div style="padding: 10px 100px 10px;" id="newgood" class="collapse out">
    <form class="bs-example bs-example-form" role="form" action="/addgood">
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="name" class="form-control" placeholder="商品名称">
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="price" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"
                   placeholder="商品单价(请您键入纯数字)">
            <span class="input-group-addon">元</span>
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="intro" class="form-control" placeholder="商品描述">
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="stock" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"
                   placeholder="商品库存(请您键入纯数字)">
            <span class="input-group-addon">个</span>
        </div>
        <input type="submit" value="提交">
    </form>
</div>

<div style="padding: 10px 100px 10px;" id="delete_goods" class="collapse out">
    <form class="bs-example bs-example-form" role="form" action="/addgood">
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="name" class="form-control"
                   placeholder="商品名称">
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="price" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"
                   placeholder="商品单价(请您键入纯数字)">
            <span class="input-group-addon">元</span>
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="intro" class="form-control" placeholder="商品描述">
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">✎</span>
            <input type="text" name="stock" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"
                   placeholder="商品库存(请您键入纯数字)">
            <span class="input-group-addon">个</span>
        </div>
        <input type="submit" value="提交">
    </form>
</div>

</body>
</html>