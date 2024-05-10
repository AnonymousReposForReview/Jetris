package tests.javafuzzer666;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:32:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static float fFld=0.788F;
    public static byte byFld=-44;
    public long lFld=7L;
    public static boolean bFld=true;
    public static volatile long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -11L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(short s1) {

        int i6=5, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 23701);

        i6 *= (int)Test.fFld;
        iArr1[(5 >>> 1) % N] <<= i6;
        long meth_res = s1 + i6 + FuzzerUtils.checkSum(iArr1);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l1) {

        int i4=9, i5=13, i7=-65, i8=-33566, i9=-12129, i10=-78, iArr[]=new int[N];
        short s=-23616;
        boolean b=false;
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr, -220L);
        FuzzerUtils.init(dArr, 40.3670);

        for (i4 = 234; 14 < i4; i4--) {
            l1 = ((s--) - (i5 %= (int)((i4 >> Test.instanceCount) | 1)));
            switch (((((++iArr[i4 + 1]) >>> 1) % 6) * 5) + 44) {
            case 63:
                if (true) {
                    if (!((i5 += (-91 - iMeth2(s))) > Test.fFld)) break;
                    i5 += i5;
                }
                iArr[i4] -= (int)2.70F;
                Test.fFld %= 19467;
                break;
            case 57:
                for (i7 = 1; 7 > i7; i7++) {
                    i9 = 1;
                    while (++i9 < 2) {
                        lArr[i4] <<= i9;
                    }
                    if (b) {
                        s = (short)i9;
                    }
                    Test.instanceCount += 4L;
                    lArr[i7 + 1] = -5;
                }
                break;
            case 61:
                iArr[i4 + 1] = i10;
                break;
            case 46:
                i10 += (i4 * i8);
                break;
            case 65:
                i10 = i7;
                break;
            case 49:
                i8 >>>= i7;
                break;
            default:
                dArr[i4] = i8;
            }
        }
        long meth_res = l1 + i4 + i5 + s + i7 + i8 + i9 + (b ? 1 : 0) + i10 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, long l) {

        int i1=-13, i2=-152, i3=-41114, i11=-28520, i12=-7, i13=17, i14=-101;
        byte by=36;
        short s2=10635;

        for (i1 = 12; 268 > i1; i1++) {
            Test.instanceCount = (((i1 + i1) + (i + i2)) - ((i3--) + iMeth1(-1201206580L)));
            i3 = (int)Test.instanceCount;
            Test.fFld -= i2;
            by += (byte)-2.128296;
            Test.lArrFld[i1][i1 + 1] += i2;
            if (false) continue;
            i &= (int)l;
        }
        for (i11 = 6; i11 < 152; i11++) {
            i2 -= i2;
            i2 += (i11 + l);
            for (i13 = 1; i13 < 11; i13 += 3) {
                Test.fFld = i11;
                Test.byFld += (byte)i3;
            }
            s2 -= (short)i11;
        }
        long meth_res = i + l + i1 + i2 + i3 + by + i11 + i12 + i13 + i14 + s2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=8982, i17=124, i18=62808, i19=-144, i20=-161, i21=2, i22=89, i23=-161, i24=-101, i25=18, iArr2[]=new
            int[N];

        FuzzerUtils.init(iArr2, -179);

        iMeth(i15, Test.instanceCount);
        i15 -= i15;
        for (int i16 : iArr2) {
            i16 = 119;
            Test.lArrFld[(i16 >>> 1) % N][(i15 >>> 1) % N] -= i16;
            for (i17 = 2; i17 < 63; ++i17) {
                Test.lArrFld[i17][i17 - 1] = i18;
                Test.fFld -= Test.instanceCount;
                i15 = Test.byFld;
                i18 += i16;
                i15 += (i17 | i15);
                try {
                    i18 = (i18 / i16);
                    iArr2[i17 - 1] = (37451 % i17);
                    i16 = (i17 % i18);
                } catch (ArithmeticException a_e) {}
            }
            Test.instanceCount = -23;
            for (i19 = 1; 63 > i19; ++i19) {
                for (i21 = 1; i21 < 2; ++i21) {
                    try {
                        i20 = (i15 % 1845672590);
                        i15 = (i15 % 22842);
                        i18 = (i20 % i22);
                    } catch (ArithmeticException a_e) {}
                    i20 = i20;
                    i18 -= (int)Test.fFld;
                    lFld -= Test.instanceCount;
                }
                i16 += i15;
                for (i23 = 1; i23 < 2; ++i23) {
                    i24 = -125;
                    i20 += (int)(189L + (i23 * i23));
                }
                i22 -= i21;
                i24 += (int)Test.instanceCount;
                i22 *= i19;
                if (Test.bFld) continue;
                i25 = 1;
                do {
                    i24 <<= i17;
                    i24 |= 236;
                } while (++i25 < 2);
            }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
