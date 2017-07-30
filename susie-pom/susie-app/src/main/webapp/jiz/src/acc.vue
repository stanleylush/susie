<template>  
    <div class="wrapper">
        <div class="acc">
            <div style="height: 80px; width: 100%; background-color: #48c9bf; border-radius: 10px; margin-top: 40px;">
              <text style="text-align: center;font-size:50px;line-height:80px;">记账本</text>
            </div>
            <table class="acc-table">
              <th class="acc-th">收入：</th>
              <tr class="tr-wrapper">
                <td class="acc-td-text">微信：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">支付宝：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">卡：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">其他：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">备注：</td>
                <td colspan="3">
                  <input class="input" type="text" value="" style="width:552px"/>
                </td>
              </tr>
            </table>
            <table class="acc-table">
              <th class="acc-th">支出：</th>
              <tr class="tr-wrapper">
                <td class="acc-td-text">支出名：</td>
                <td colspan="3">
                  <input class="input" type="text" value="" style="width:552px"/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">微信：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">支付宝：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">卡：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">其他：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">备注：</td>
                <td colspan="3">
                  <input class="input" type="text" value="" style="width:552px"/>
                </td>
              </tr>
            </table>
            <table class="acc-table">
              <th class="acc-th">债务：</th>
              <tr class="tr-wrapper">
                <td class="acc-td-text">微信：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">支付宝：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">卡：</td>
                <td>
                  <input class="input" type="text" autofocus="true" value=""/>
                </td>
                <td class="acc-td-text">其他：</td>
                <td>
                  <input class="input" type="text" value=""/>
                </td>
              </tr>
              <tr class="tr-wrapper">
                <td class="acc-td-text">备注：</td>
                <td colspan="3">
                  <input class="input" type="text" value="" style="width:552px"/>
                </td>
              </tr>
            </table>
        </div> 
    </div>  
</template>  
<script>  
    module.exports = {  
        data:{  
            userNumber:'',  
            userPassword:''  
        },  
        methods:{
            
        }  
    }  
</script> 
<style>  
    .wrapper {  
        position: absolute;  
        top: 0;  
        right: 0;  
        bottom: 0;  
        left: 0;  
    }  
    .acc{
        margin-top: 5px;  
    }
    .acc-table{
      width: 100%;
      border-width: 2px;
      border-color: #48c9bf;
      margin-top: 10px;
    }
    .acc-th{
      font-size: 45px;
    }
    .acc-td-text{
      padding-left: 30px;
      font-size: 40px; 
    }
    .tr-wrapper{
      height: 90px;
    }
    .input {  
        font-size: 40px;  
        height: 80px;  
        width: 150px;
        padding-left: 5px;
        border-width:2px;  
        border-color: #48c9bf;  
        border-radius:10px;  
        outline: none;
    }
</style>