# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Interface to IO board that manages emergency stop and battery voltage on rob@work 3"
AUTHOR = "Alexander Bubeck <aub@ipa.fhg.de>"
ROS_AUTHOR = "Alexander Bubeck"
HOMEPAGE = "None"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_voltage_control"

ROS_BUILD_DEPENDS = " \
    cob-msgs \
    cob-phidgets \
    dynamic-reconfigure \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cob-msgs \
    cob-phidgets \
    dynamic-reconfigure \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-msgs \
    cob-phidgets \
    dynamic-reconfigure \
    python3-matplotlib \
    python3-tkinter \
    roscpp \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/4am-robotics/cob_driver-release/archive/release/noetic/cob_voltage_control/0.7.17-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_voltage_control"
SRC_URI = "git://github.com/4am-robotics/cob_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "715320e71629ca9860f387bfa2dbcaf48b2bf0f2"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
