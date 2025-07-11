# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "<p>This package represents <a href="http://openrtm.org/">OpenRTM-aist</a> that's built within ROS eco system. Although being ROS-agnostic by itself, you can use this via ROS together with the packages in <a href="http://www.ros.org/wiki/rtmros_common">rtmros_common</a> that bridge between two framework.</p>    <p><i>OpenRTM-aist is an <a href="http://ieeexplore.ieee.org/xpl/login.jsp?tp=&amp;arnumber=1545521&amp;url=http%3A%2F%2Fieeexplore.ieee.org%2Fiel5%2F10375%2F32977%2F01545521.pdf%3Farnumber%3D1545521">RT-Middleware</a>-baseed, component-oriented software platform to robotics development that is made and maintained in AIST (National Institute of Advanced Industrial Science and Technology) in Japan </i> (<a href="http://openrtm.org/openrtm/en/content/introduction-0">excerpts from here</a>)</p>     <p>Its development is happening at <a href="http://www.openrtm.org/pub/OpenRTM-aist/">openrtm.org/pub/OpenRTM-aist</a>. The repository listed below is where the development of its ROS wrapper happening.</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Noriaki Ando <n-ando@aist.go.jp>"
HOMEPAGE = "http://ros.org/wiki/openrtm_aist"
SECTION = "devel"
LICENSE = "EPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=b1456987590b6d6fb15d36f398651b8b"

ROS_CN = "openrtm_aist"
ROS_BPN = "openrtm_aist"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-omniorb} \
    ${ROS_UNRESOLVED_DEP-python-dev} \
    doxygen \
    util-linux \
"

ROS_BUILDTOOL_DEPENDS = " \
    automake-native \
    cmake-native \
    libtool-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-omniorb} \
    catkin \
    util-linux \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-omniorb} \
    catkin \
    util-linux \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/openrtm_aist-release/archive/release/noetic/openrtm_aist/1.1.2-5.tar.gz
ROS_BRANCH ?= "branch=release/noetic/openrtm_aist"
SRC_URI = "git://github.com/tork-a/openrtm_aist-release;${ROS_BRANCH};protocol=https"
SRCREV = "37ae57227bf2ae0520c3f8c13d6f8503d12c21fb"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
