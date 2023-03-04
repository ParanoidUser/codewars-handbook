# Sổ tay Codewars ☕️🚀

[![Thống kê lượt xem  +1 👀](https://img.shields.io/badge/dynamic/xml?color=success&label=views&query=//*[name()=%27text%27][3]&url=https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2FParanoidUser%2Fcodewars-handbook)](https://hits.seeyoufarm.com/api/count/graph/dailyhits.svg?url=https://github.com/ParanoidUser/codewars-handbook)
[![kata đã giải quyết 👌](https://img.shields.io/badge/solved%20kata-1285-red.svg)](https://www.codewars.com/kata/search/java)
[![Đường ống pipeline 🛠](https://img.shields.io/github/actions/workflow/status/ParanoidUser/codewars-handbook/build.yml?branch=main)](https://github.com/ParanoidUser/codewars-handbook/actions/workflows/build.yml)
[![Cổng chất lượng 🔎](https://img.shields.io/sonar/alert_status/codewars-handbook?server=https%3A%2F%2Fsonarcloud.io)](https://sonarcloud.io/dashboard?id=codewars-handbook)
[![Chúng ta hãy trò chuyện! 📞](https://img.shields.io/gitter/room/ParanoidUser/codewars-handbook?color=49c39e)](https://gitter.im/ParanoidUser/codewars-handbook)

[Codewars](https://www.codewars.com) là một nền tảng giáo dục trực tuyến về lập trình máy tính. Trên nền tảng này, người dùng được biết đến với tên là code warriors cố gắng giải quyết các thách thức lập trình, được gọi là kata, để tập luyện kỹ năng lập trình và kiếm điểm danh dự. Mỗi kata được gán một cấp độ kyū dựa trên chủ đề và độ khó của nó. Càng khó càng được nhận nhiều điểm. Tất cả các code warrior đều bắt đầu từ 8 kyū 👘 và tiến lên qua các cấp độ cho đến cấp độ 4th dan cuối cùng 🥋. Warriors không phải là những người chiến thắng, mà là những người luôn chiến đấu. Banzai!

## Tổng quan

Kho lưu trữ chứa một tập hợp các giải pháp Java cho các thách thức trong Codewars, được nhóm theo thứ hạng kyū.
Mỗi kata được tổ chức trong một thư mục riêng biệt được đặt tên bởi con sên của nó và kèm theo một mô tả nhiệm vụ,mã nguồn giải pháp và kiểm tra xác minh. Tất cả các giải pháp đã được giải quyết
trên [nền tảng chính thức](https://www.codewars.com) và được xác minh đối với bộ thử nghiệm ban đầu.

<ins>Để truy cập nhanh</ins>, sử dụng bảng chỉ mục hoặc tìm kiếm kho lưu trữ bằng kata URL, tên, ID hoặc
sên.

| [1 kyu](/kata/1-kyu/index.md) | [2 kyu](/kata/2-kyu/index.md) | [3 kyu](/kata/3-kyu/index.md) | [4 kyu](/kata/4-kyu/index.md) | [5 kyu](/kata/5-kyu/index.md) | [6 kyu](/kata/6-kyu/index.md) | [7 kyu](/kata/7-kyu/index.md) | [8 kyu](/kata/8-kyu/index.md) | [beta](/kata/beta/index.md) | [retired](/kata/retired/index.md) |
|:-----------------------------:|:-----------------------------:|:-----------------------------:|:-----------------------------:|:-----------------------------:|:-----------------------------:|:-----------------------------:|:-----------------------------:|:---------------------------:|:---------------------------------:|
|               -               |               -               |               2               |              13               |              26               |              393              |              527              |              192              |             62              |                70                 |

**Lưu ý:** Mã nguồn được viết bằng Java 17 và có thể sử dụng các tính năng ngôn ngữ không tương thích
với Java 8, 11.

## ❤️ Tín dụng

Xin gửi lời cảm ơn 🙌 tới tất cả thành viên cộng đồng trên toàn thế giới, sự hỗ trợ của bạn được đánh giá rất cao! mỗi bạn
sẽ được công nhận trong
các [ghi chú phát hành](https://github.com/ParanoidUser/codewars-handbook/releases) và ghim 📌 vào
bản đồ sao ⭐🌎.
[![bản đồ sao](https://user-images.githubusercontent.com/5120290/222739084-d6d90f05-f07d-40aa-adfe-8acfb3858a95.png)](https://www.fla-shop.com/visited-countries/?st=BO%2CBR%2CBY%2CCA%2CCN%2CCO%2CEE%2CEG%2CES%2CFR%2CGB%2CGE%2CID%2CIN%2CJP%2CKE%2CLK%2CNG%2CPL%2CPT%2CRU%2CTH%2CTR%2CTW%2CUA%2CUS%2CVN&vc=6699cc&uc=e8e8e8&hc=40bfa6&bc=ffffff&ss=on)

## ⚠️  Từ chối trách nhiệm

Vui lòng **KHÔNG** xem các giải pháp cho đến khi bạn giải xong một bài kata, hoặc ít nhất là dành thời gian
suy nghĩ về cách tiếp cận của riêng bạn để giải quyết thách thức. Hãy nhớ rằng, nếu bạn sử dụng tài liệu từ
kho lưu trữ để đạt được thứ hạng, bạn là
vi phạm [nguyên tắc Codewars](https://docs.codewars.com/community/rules/#policy):
> Nếu bạn bị phát hiện gian lận trong một thử thách, ban đầu giải pháp của bạn sẽ bị đánh dấu là gian lận
> và sẽ không nhận được bất kỳ vinh dự hay cấp bậc nào. Điều này bao gồm các giải pháp thông minh được tạo ra rõ ràng
> cho tinh thần gian lận. Những người tái phạm cố ý gian lận sẽ bị cấm.

Bạn thừa nhận và đồng ý rằng bạn tự chịu rủi ro khi sử dụng các tài liệu của kho lưu trữ. Tác giả
không chịu trách nhiệm hoặc trách nhiệm pháp lý nào đối với bất kỳ hậu quả nào phát sinh trực tiếp hoặc
gián tiếp từ bất kỳ hành động hoặc không hành động nào của bạn trên cơ sở, hoặc dựa vào, bất kỳ
thông tin hoặc tài liệu có trong hoặc liên kết với kho lưu trữ này. Thông tin chứa trong này
kho lưu trữ được cung cấp "nguyên trạng" không có bảo đảm về tính đầy đủ, chính xác, hữu ích hoặc
tính kịp thời. Tác giả bảo lưu quyền thay đổi bất kỳ mục nào được sử dụng hoặc có trong
kho lưu trữ bất cứ lúc nào mà không cần thông báo.
1
