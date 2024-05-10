package tests.javafuzzer56;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:38:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2181732739181697754L;
    public static double dFld=61.29464;
    public int iFld=1;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -31091);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7) {


        i7 += i7;
        long meth_res = i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i6, long l1) {

        float f=77.129F;
        int i8=0, i9=-248, i10=41981;
        long l2=-15614L;

        i6 = (i6++);
        f += (iMeth(168) + i6);
        i6 *= i6;
        for (i8 = 2; 393 > i8; ++i8) {
            if (i9 != 0) {
                vMeth1_check_sum += i6 + l1 + Float.floatToIntBits(f) + i8 + i9 + l2 + i10;
                return;
            }
            i6 = i6;
            i6 = i6;
            i6 -= -1666;
            i9 = (int)Test.dFld;
            Test.instanceCount = 250L;
            for (l2 = 1; l2 < 4; l2++) {
                i6 += (int)(((l2 * i6) + i8) - i6);
                f += (((l2 * i10) + f) - l2);
            }
        }
        vMeth1_check_sum += i6 + l1 + Float.floatToIntBits(f) + i8 + i9 + l2 + i10;
    }

    public static void vMeth(byte by, int i1) {

        int i2=-93, i3=-64459, i4=51715, i5=-199;
        short s=-26368;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -32.381F);

        i2 = 128;
        while (--i2 > 0) {
            for (i3 = i2; 12 > i3; i3++) {
                fArr[i3 - 1] -= (((i2 + -3) % ((long)(Float.intBitsToFloat(i3)) | 1)) * (-Test.instanceCount));
                i4 = (~(--i4));
                i5 = 1;
                do {
                    i1 >>>= (int)(++Test.instanceCount);
                    Test.instanceCount += (i5 * i5);
                    i4 += (int)(Test.instanceCount * (i1++));
                    if (i2 != 0) {
                        vMeth_check_sum += by + i1 + i2 + i3 + i4 + i5 + s +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    i1 += i4;
                    switch ((i3 % 5) + 122) {
                    case 122:
                        if (i2 != 0) {
                            vMeth_check_sum += by + i1 + i2 + i3 + i4 + i5 + s +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                    case 123:
                        vMeth1(i3, Test.instanceCount);
                        Test.iArrFld[i3 + 1] += (int)Test.instanceCount;
                        Test.iArrFld[i5 - 1] >>>= 28446;
                        break;
                    case 124:
                        s += (short)17037;
                        break;
                    case 125:
                        Test.instanceCount >>= i5;
                        break;
                    case 126:
                        i4 += (-9 + (i5 * i5));
                    default:
                        i1 -= (int)Test.instanceCount;
                    }
                } while (--i5 > 0);
            }
        }
        vMeth_check_sum += by + i1 + i2 + i3 + i4 + i5 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        long l=11L;
        int i11=-218, i12=-11, i13=54521, i14=-204, iArr[]=new int[N], iArr1[]=new int[N];
        boolean b=false;
        byte byArr[]=new byte[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -89);
        FuzzerUtils.init(byArr, (byte)-122);
        FuzzerUtils.init(fArr1, -1.628F);
        FuzzerUtils.init(iArr1, -28985);

        for (int i : iArr) {
            l = 63;
            do {
                i >>= ((i + (iArr[(int)(l - 1)]++)) >> (-(i--)));
                vMeth((byte)(41), -210);
                i += (int)(l + i);
                try {
                    Test.iArrFld[(int)(l - 1)] = (i % i);
                    iFld = (i / i);
                    iFld = (iFld % -66);
                } catch (ArithmeticException a_e) {}
                i &= iFld;
                for (i11 = 1; i11 < 1; ++i11) {
                    i12 -= (int)Test.instanceCount;
                    iFld = 13;
                    iFld |= -6;
                    byArr = byArr;
                }
                fArr1[(int)(l + 1)] = i11;
                i13 = 1;
                while ((i13 += 2) < 1) {
                    if (b) {
                        Test.iArrFld[i13 + 1] = (int)3104937347L;
                    } else if (false) {
                        switch (((i13 % 7) * 5) + 2) {
                        case 3:
                            b = b;
                            break;
                        case 15:
                            if (b) break;
                            break;
                        case 30:
                            if (b) continue;
                            b = b;
                        case 16:
                            i12 = i13;
                            iFld = i11;
                            iArr1[(int)(l + 1)] *= (int)Test.instanceCount;
                            Test.instanceCount += (i13 ^ i11);
                        case 26:
                            i += (int)-1.955F;
                            iArr1[i13 + 1] = -21;
                            Test.dFld *= i;
                            break;
                        case 7:
                            Test.iArrFld[(int)(l - 1)] = i;
                            Test.iArrFld[i13] = i11;
                            break;
                        case 24:
                            i14 += iFld;
                            break;
                        default:
                            Test.instanceCount ^= -7;
                        }
                    }
                }
            } while (--l > 0);
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
